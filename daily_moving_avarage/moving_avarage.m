t = [-1*pi:0.1:1*pi]
v = sin(4*t); 
figure; plot(t,v); hold on;
daily = 25;
h = dailyMovingAvarage(daily, v);
plot(t,h);
hold off;

function h = dailyMovingAvarage(daily, v)
    size = length(v);
    h = zeros(1, size);
    for i=1:size-daily+1
        sum = 0;
        for j=i:i+daily-1
            sum = sum + v(j);
        end
        h(i + (daily-1)) = sum / daily;
    end
end

